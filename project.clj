(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "the game"
  :url "http://github.com/lisperow/parens-of-the-dead"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}
  :jvm-opts ["-XX:MaxPermSize=256m"]
  :main undead.system
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.3.0"]
                 [com.stuartsierra/component "0.4.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [compojure "1.6.1"]]
  :profiles {:dev {:plugins [[lein-cljsbuild "1.1.7"]
                             [lein-figwheel "0.5.19"]]
                   :dependencies [[reloaded.repl "0.1.0"]]
                   :source-paths ["dev"]
                   :cljsbuild {:builds [{:source-paths ["src" "dev"]
                                         :figwheel true
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :output-dir "target/classes/public/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true}}]}}})