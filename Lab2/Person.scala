import scala.beans.BeanProperty;

class Person(protected val id: String, val givenName: String, @BeanProperty var surname: String){
  def name = givenName + " " + surname

}

object Appl{
  def main(args: Array[String]): Unit ={
    val p = new Person("10", "Jan", "Kowalski");
    println(p.name);
    println(p.givenName);
    p.setSurname("Nowak");
    println(p.name);
    //println(id);
  }
}