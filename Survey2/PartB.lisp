Carter Copen
This follows academic integrity




(defun same-list (lizt1 lizt2)
 
    (cond
        ((null lizt1) (null lizt2))
        
        ((null lizt2) nil)
        
        ( (eql (car lizt1) (car lizt2)) (same-list(cdr lizt1) (cdr lizt2)) )
        
        (t nil)
    )
)
        
(write (same-list (list 'A 'B 'C) (list 'A 'B 'C)))
(write (same-list (list 1 2 3) (list 1 2 3)))
(write (same-list (list 'A 'B ) (list 'A 'B 'C)))
(write (same-list (list 'A 'B 'C) (list 'A 'B )))
(write (same-list (list 'A 'B 'C 1 2 3) (list 'A 'B 'C 1 2 2)))
