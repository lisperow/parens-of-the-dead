(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "the game"
  :url "http://github.com/lisperow/parens-of-the-dead"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}
  :jvm-opts ["-XX:MaxPermSize=256m"]
  :dependencies [[org.clojure/clojure ""]]
  :profiles {:dev {:plugins []
                   :dependencies []
                   :sourse-paths ["dev"]}})