import javax.xml.crypto.Data;

public class func {
	
		int d ;
		func next;

 public func insert(func l , int newData) {
	 func tmp = new func();
	tmp.d = newData;
	tmp.next = l;
	return tmp;
	
}
 public void func(func l) {
	 if(l!=null) {
		 System.out.print(l.d);
		 func(l.next);
		 System.out.print(l.d);
	 }
 }
}
