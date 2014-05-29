//package nsl.tuple
//
//import java.io.File
//import scala.io.Source
//import scala.collection.mutable
//
//object Golf {
//  def getDict(): Set[String] = Source.fromFile(new File("/usr/share/dict/words")).getLines.foldLeft(Set[String]()) { (acc: Set[String], word: String) => acc + word }
//  // Set("cat", "cap", "cop", "cot", "tap", "top")
//  implicit val dict: Set[String] = getDict()
//  implicit val ab: Set[Char] = Set('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
//      'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
//
//  def replaceChar(s: String, i: Int, c: Char): String = {
//    val front: String = s.substring(0, i)
//    val back: String = s.substring(i+1, s.length)
//    front + c + back
//  }
//
////  def allGolf(from: String, to: String)
////          (implicit dictionary: Set[String], alphabet: Set[Char]): Set[List[String]] = {
////    def helper(f: String, listAcc: List[String], seen: List[String], setAcc: Set[List[String]]): Set[List[String]] = {
////      if (!dictionary.contains(f)) return Set()
////      if (f == to) return Set(listAcc)
////
////      val possibleMutations: IndexedSeq[(Int, Char)] = for (index: Int <- Range(0, f.length); replacement: Char <- alphabet) yield (index, replacement)
////      possibleMutations.par.foldLeft (Set[List[String]]()) { (foldAcc: Set[List[String]], elem: (Int, Char)) =>
////        val (index, replacement) = elem
////        val newFrom: String = replaceChar(f, index, replacement)
////        if (seen.contains(newFrom)) foldAcc else foldAcc ++ helper(newFrom, newFrom :: listAcc, newFrom :: seen)
////      }
////    }
////    helper(from, List(from), List(from))
////  }
//
//  def golf(from: String, to: String)
//          (implicit dictionary: Set[String], alphabet: Set[Char]): Option[List[String]] = {
//
//
//    val path: mutable.List[String] = mutable.MutableList(to)
//    while (path.last != to && !false) { // TODO include a no solution break condition.
//      val possibleMutations: IndexedSeq[String] = for (index: Int <- Range(0, from.length); replacement: Char <- alphabet) yield replaceChar(path.last, i, c)
//      possibleMutations.foreach { s: String => if (!path.contains(s)) path += s
//    }
//
//
////    def helper(f: String, acc: List[String]): Option[List[String]] = {
////      if (!dictionary.contains(f)) None
////      if (f == to) Some(acc)
////
////      val neighbors: Set[String] = possibleMutations.map { case (index: Int, replacement: Char) => replaceChar(from, index, replacement) }.toSet
////      val possibleNext: Set[String] = neighbors.filter(!acc.contains(_))
////      possibleNext.foreach { case next: String => val path = helper(f, f :: acc); if (path.isDefined) return path }
////      None
////    }
////    helper(from, List(from))
//  }
//
//  def main(args: Array[String]) {
//    println("tail -> head")
//    val start = System.nanoTime()
//    golf("head", "tail").toList.sortBy(_.length).foreach(println)
//    println("took: %s milliseconds".format((System.nanoTime() - start) / 1000000))
//  }
//}
//
