# Scalatra Hello Resource

Using resources in [scalatra](http://scalatra.org/) applications isn't straightforward.

Resource files should be in `src/main/webapp/WEB-INF`. Beware, other files in `webapp` are [publicly available](http://scalatra.org/getting-started/project-structure.html#serving-static-files).

To access those files, `getClass.getResource` will not work. Use `getServletContext().getRealPath("/WEB-INF/hello.txt")` instead.
