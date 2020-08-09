/**
 * Retrieve form parameters data
 */
export async function getFormData() {
    const response = await fetch('/api/formdata');
    return await response.json();
}