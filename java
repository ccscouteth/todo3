const taskInput = document.getElementById('taskInput');
const addTaskButton = document.getElementById('addTaskButton');
const taskList = document.getElementById('taskList');

addTaskButton.addEventListener('click', () => {
    const taskText = taskInput.value;
    if (taskText.trim() !== '') {
        const taskItem = document.createElement('li');
        taskItem.innerText = taskText;
        taskList.appendChild(taskItem);
        taskInput.value = '';
    }
});
