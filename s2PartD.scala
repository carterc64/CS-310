/* Online Scala Compiler */
object PartD {
    def main(args: Array[String]) {
        println("Hello, world!")
        val lizt1 = 'A :: ('B :: Nil);
        val lizt2 = 'X ::  Nil;
        println(same (lizt1, lizt2));
    }

    def same (lizt1: List[Any], lizt2: List[Any]) : Boolean = {
        if (lizt1.isEmpty) {
            if (lizt2.isEmpty) {
                return true;
            } else {
                return false;
            }
        } else if (lizt2.isEmpty) {
            return false;
        } else {
            if (lizt1.head.equals(lizt2.head)) {
                return same(lizt1.tail , lizt2.tail);
            } else {
                return false;
            }
        }
    }
}

import org.scalatest.funsuite.AnyFunSuite

class sameTest extends AnyFunSuite:
	test("PartD.same") {
		assert(PartD.same(('A :: ('B :: Nil)), ('A :: ('B :: Nil))) === true);
		assert(PartD.same((1 :: (2 :: Nil)), (1 :: Nil)) === false);
		assert(PartD.same(('A ::Nil), ('A :: ('B :: Nil))) === false);
	}

