## Minimum example showing JsInterop/Elemental class casting failing on Edge.

I included a replacement Location class in my project to get access to the things
that are missing in Elemental2's Location. I can successfully cast Elemental2's
`DomGlobal.window.location` instance to my Location class in Safari, Chrome, and
Firefox, but Edge throws a `java.lang.ClassCastException`.

To see it in action, build the project via `mvn compile gwt:compile`, copy
`src/resources/main/index.html` to `target/edgetest-0.0.1-SNAPSHOT/` and start
an HTTP server in that directory.  (I just use `python -m SimpleHTTPServer`.)

Load up whatever port you end up serving it on in a web browser. You should see
the location hash change to `#an-empty-hash`, and a line in the console log writing
that value out. On Edge, the hash will change, but you'll see a `java.lang.ClassCastException`
instead.
