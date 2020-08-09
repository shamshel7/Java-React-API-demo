import React, { Component } from 'react';
import './App.css';
import { getAllMessages, createMessage } from './services/MessageService';
import { getFormData } from './services/FormDataService';

class App extends Component {
    constructor(props) {
        super(props);

        this.state = {
            formData: [],       // Data received from the back-end defining which kinds of input the form should have
            messageValues: [],  // Inputted data to be sent to the band-end
            allMessages: []     // Messages received from the back-end to be displayed in the table
        }

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    componentDidMount() {
        this.getFormData();
        this.getAllMessages();
            
    }

    /**
     * Retrieve form information from API
     */
    getFormData = () => {
        getFormData()
            .then(data => {
                this.setState({
                    formData: data
                })
                this.getValues();
            })
    }
    
    /**
     * Initial setting of message parameters (with empty values)
     */
    getValues() {
        var mv = this.state.messageValues;
        var fd = this.state.formData;

        for (let i = 0; i < fd.length; i++) {
            mv.push({
                id: fd[i].id,
                value: ""
            });
        }
        this.setState({
            messageValues: mv
        });
    }

    /**
     * Retrieve existing message data for table
     */
    getAllMessages = () => {
        getAllMessages()
            .then(messages => {
                this.setState({
                    allMessages: messages
                })
            });
    }

    /**
     * Display messages
     */
    displayMessages() {
        return (
            <table className="table">
                <thead>
                    <tr>
                        {this.state.formData.map(data => {
                            return (
                                <th key={data.id} >{data.fieldName}</th>
                            )
                        })}
                    </tr>
                </thead>
                <tbody>
                    {
                    this.state.allMessages.map(item => {
                        return (
                            <tr key={item.id}>
                                {this.state.formData.map(data => {
                                    let i = data.id.toString();
                                    return (
                                        <td key={data.id}>
                                            {item[i]}
                                        </td>
                                    )
                                })}
                            </tr>
                        );
                    })
                    }
                </tbody>
            </table>
        )
        
    }

    render() {
        return (
            <div className="App">
                <div className="header">
                    Java-React API Demo
                </div>
                <div className="body">
                    <form className="form" onSubmit={this.handleSubmit}>
                        {this.state.formData.map(data => {
                            return (
                                <label className="form-label" key={data.id}>
                                    <p className="form-title">{data.fieldName}</p>
                                    <input className="form-input" type="text" name={data.id} value={this.state.messageValues.value} onChange={this.handleChange} />
                                </label>
                            )
                        })}
                        <input className="submit" type="submit" value="SUBMIT" />
                    </form>
                    {this.displayMessages()}
                </div>
            </div>
        );
    }

    /**
     * Create new message and send to API
     */
    createMessage = () => {
        createMessage(this.state.messageValues)
            .then(response => {
                console.log(response);
            });
    }

    handleChange(event) {
        let mv = this.state.messageValues;
        let fd = this.state.formData;

        for (let i = 0; i < fd.length; i++) {
            if (event.target.name === fd[i].id) {
                for (let j = 0; j < mv.length; j++) {
                    if (mv[j].id === event.target.name) {
                        mv[j].value = event.target.value;
                    }
                }
            }
        }

        this.setState({
            messageValues: mv
        })
    }

    handleSubmit() {
        const mv = this.state.messageValues;
        if (!this.verifyInputs(mv)) {
            return false;
        };

        var messageData = {id: this.state.allMessages.length + 1};
        for (let i = 0; i < mv.length; i++) {
            const fieldName = mv[i].id.toString();
            messageData[fieldName] = mv[i].value;
        }

        createMessage(messageData)
            .then(response => {
                console.log(response);
                this.getAllMessages();
            });
    }

    /**
     * Checks input data and verifies it's validity
     * @param {Array[Object]} data 
     */
    verifyInputs(data) {
        for (let i = 0; i < data.length; i++) {
            if (data[i].value === "") {
                alert("Fields cannot be blank!")
                return false;
            }
            if (data[i].id === "email" && !data[i].value.includes("@")) {
                alert("Email address invalid");
                return false;
            }
        }
        return true;
    }
}

export default App;
