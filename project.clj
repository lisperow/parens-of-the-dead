(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "the game"
  :url "http://github.com/lisperow/parens-of-the-dead"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}
  :jvm-opts ["-XX:MaxPermSize=256m"]
  :main undead.system
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http-kit "2.3.0"]
                 [com.stuartsierra/component "0.4.0"]]
  :profiles {:dev {:plugins []
                   :dependencies [[reloaded.repl "0.1.0"]]
                   :sourse-paths ["dev"]}})
