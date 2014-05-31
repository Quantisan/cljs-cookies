(defproject cljs-cookies "0.1.0-SNAPSHOT"
  :description "A ClojureScript library for using browser cookies"
  :url "http://github.com/Quantisan/cljs-cookies"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2227"]]

  :plugins [[lein-cljsbuild "1.0.2"]]
  :plugins [[com.cemerick/clojurescript.test "0.3.1"]
            [lein-cljsbuild "1.0.3"]]
  :hooks [leiningen.cljsbuild]
  :min-lein-version "2.0.0"
  :lein-release {:deploy-via :clojars}

  :cljsbuild {:builds [
                       ;{:compiler {:output-to "target/cljs-cookies-debug.js"}
                        ;:source-paths ["src"]}
                       ;{:compiler {:output-to "target/cljs-cookies.js"
                                   ;:optimizations :advanced
                                   ;:pretty-print false}
                        ;:source-paths ["src"]}
                       {:compiler {:output-to "target/cljs-cookies-test.js"
                                   :optimizations :whitespace
                                   :pretty-print true}
                        :source-paths ["src" "test"]}]
              :test-commands {"phantom" ["phantomjs" :runner "target/cljs-cookies-test.js"]}})
