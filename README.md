# Scalatra Hello Resource

Using resources in [scalatra](http://scalatra.org/) applications isn't straightforward.

Resource files should be in `src/main/webapp/WEB-INF`. Beware, other files in `webapp` are [publicly available](http://scalatra.org/getting-started/project-structure.html#serving-static-files).

To access those files, `getClass.getResource` will not work. Use `getServletContext.getResource` instead. The path of the resource starts with `/WEB-INF`.

`ScalatraFunSuite` uses `src/main/webapp` for the resource base. This works fine for single build projects, but fails for multi build ones. You must update the path with `servletContextHandler.setResourceBase(s"${ProjectName}/${resourceBasePath}")` in every `ScalatraFunSuite`.
