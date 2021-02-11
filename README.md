# reify-interview

This repository is the starting code for a coding interview. The coding interview includes three goals:
1. Update `resources/public/js/app.js` to fetch and render todos using the `/todos` JSON endpoint.
1. Update the `/todos` endpoint to fetch its todos from the `todos.db` sqlite database. See the `reify-interview.db` namespace for a starting point.
  1. When you run `lein test`, the "all todos" test should pass.
1. Fetch only completed or incomplete todos.
  1. Update the `/todos` endpoint to return only completed todos when the query param `?completed=true` is present and only incomplete todos when the query param `?completed=false` is present.
  1. Update `resources/public/index.html` and `resources/public/js/app.js` so there is a button which fetches completed todos and a button which fetches incomplete todos.
  1. When you run `lein test`, all tests should pass.

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2021 Reify Health
