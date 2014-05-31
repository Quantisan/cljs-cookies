(ns cljs-cookies.core)

(def cookies goog.net.cookies)

(defn set-cookie [key value & {:keys [max-age]
                               :or   {max-age -1}}]
  "Sets a cookie.

   Options:
   max-age -- The max age in seconds (from now). Use -1 to set a session cookie. If not provided, the default is -1 (i.e. set a session cookie).
   "
  (.set cookies (name key) value max-age))

(defn get-cookie [key]
  "Returns the value for the first cookie with the given key."
  (.get cookies (name key)))

(defn remove-cookie [key]
  "Removes and expires a cookie."
  (.remove cookies (name key)))
