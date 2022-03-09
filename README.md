This is a boilerplate for [ScalaJS](https://www.scala-js.org) + [React](https://reactjs.org) apps using [Slinky](https://slinky.dev/).

Most boilerplates and tutorials for ScalaJS out there use [scajajs-bundler](https://scalacenter.github.io/scalajs-bundler/), which wraps [Webpack](https://webpack.js.org) and is probably great, but not for me. I don't like _Webpack_, but would be fine if it worked, however I get very confused about it, get different errors every time I try and I don't like that I don't understand what it is doing.

Apparently all _scalajs-bundler_ does is bundle together the [npm](https://www.npmjs.com) packages into the same file that results from the _ScalaJS_ compilation.

Here instead we have two files: one is the one that comes from _ScalaJS_, `target/scala-2.13/app-fastopt/main.js` and the other is one that comes from `globals.js` when built with [esbuild](https://esbuild.github.io/), `globals.bundle.js`. These two are included in `index.html`.

To start building your app, run `yarn start` (or `npm run start`) and it will bundle the dependencies then start watching the Scala files and rebuilding the main app.

If you want to add a new _npm_ dependency, modify `globals.js` and restart `yarn start`.

## Building on Netlify

- Specify the build script `yarn run build`.
  - This will use the sbt wrapper `sbtx` to run 'sbt fullLinkJS` out of nothing, and it works. It will also bundle and minify the JS globals you have on `globals.js` then move everything to a `dist` directory.
  - This is only intended to be run inside Netlify.
- Specify the publish directory `dist`.
  - Everything will be very minified and nice.
