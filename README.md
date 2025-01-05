# multiproject-example-paper

examples of [multi-project builds](https://docs.gradle.org/current/userguide/intro_multi_project_builds.html) with [run-paper](https://github.com/jpenilla/run-task)

- **`kotlin`** and **`java`** are simple multi-project builds with subprojects `moduleA` and `moduleB`
- **`kotlin-libs`** is like `kotlin` but kotlin stdlib dependency is shaded in a `libs` subproject, which is added as a plugin dependency in `plugin.yml` in the other modules
