# lein-orphanage

A Leiningen plugin to show orphaned clojure files in a project.

## Usage

Put `[lein-orphanage "0.1.0"]` into the `:plugins` vector of your project.clj.

    $ lein orphanage
    
Outputs any files that exist beneath the CWD, which are not referenced by other files within the CWD.

## License

Copyright © 2013 Frazer Irving

Distributed under the Eclipse Public License, the same as Clojure.
