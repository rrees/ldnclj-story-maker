(ns story-maker.core)

(def nouns ["house" "cat" "kettle" "potato"])
(def adjectives ["fast" "quiet" "lemony"])

(defn hello [name] (str "Hello " name))

(defn story ([]
	(str "The " (rand-nth adjectives) " " (rand-nth nouns)))
	([name]
	(str name " was in the barn")))
