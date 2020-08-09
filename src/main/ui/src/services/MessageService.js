/**
 * Retrieve messages
 */
export async function getAllMessages() {
    const response = await fetch('/api/messages');
    return await response.json();
}

/**
 * Submit new message data
 * @param {Object} data 
 */
export async function createMessage(data) {
    const response = await fetch(`/api/message`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(data)
    })
    return await response.json();
}