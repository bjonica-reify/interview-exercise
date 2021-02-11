const todoElement = document.getElementById('todos');

const todosFetcher = document.getElementById('todos-fetcher');
todosFetcher.addEventListener('click', async (event) => {
  // TODO Goal 1: Fetch todos from /todos and then render them using renderTodos
});

const renderTodos = (todos) => {
  todoElement.innerHTML = "<ul>" + todos.map(todo => `<li>${todo.title}</li>`) + "</ul>";
};
