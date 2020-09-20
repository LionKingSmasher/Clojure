(def message "TEST")
(def g 9.8)
(defn rad [a](* a (/ 180 Math/PI)))
(defn r2a [a](* a (/ Math/PI 180)))
(defn add
	([a b](+ a b))
)
(defn CMP_STR
	([a](string? a))
	)

(defn CannonX
	([V0 Angle t Angle_W w]
		(def x (* t (+ (* V0 (Math/cos (r2a Angle))) (* w (Math/cos (r2a Angle_W))))))
		(format "Result X: %f" x)
		)
	)
(defn CannonY
	([V0 Angle t M Angle_W w]
		(def y (- (* t (+ (* V0 (Math/sin (r2a Angle))) (* w (Math/sin (r2a Angle_W)))) (* M (* g (* t t))))))
		(format "Result Y: %f" y)
		)
	)