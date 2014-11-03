(ns structured-data)

(defn do-a-thing [x]
  (let [double (+ x x)]
  (Math/pow double double)))

(defn spiff [v]
  (if (< (count v) 3) nil (+ (get v 0) (get v 2))))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [[f _ t]]
    (+ f t)
    )

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn abs [n] (max n (- n)))

(defn width [[[x1 _] [x2 _]]]
  (abs (- x1 x2))
  )

(defn height [[[_ y1] [_ y2]]]
  (abs (- y1 y2))
  )

(defn square? [rectangle]
  (= (height rectangle) (width rectangle))
  )

(defn area [rectangle]
  (* (height rectangle) (width rectangle)))

(defn contains-point? [[[x1 y1] [x2 y2]] [px py]]
  (and (<= x1 px x2) (<= y1 py y2))
  )

(defn contains-rectangle? [outer [bottom-left top-right]]
  (and (contains-point? outer bottom-left) (contains-point? outer top-right))
  )

(defn title-length [book]
  (count (:title book))
  )

(defn author-count [book]
  (count (:authors book))
  )

(defn multiple-authors? [book]
  (> (author-count book) 1)
  )

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
