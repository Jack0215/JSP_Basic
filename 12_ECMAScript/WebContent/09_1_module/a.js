import {Person, bbb} from "./b.js" // ./의 의미는 현재폴더,
//export class or function 사용할경우 {}안에 클래스이름이나 함수이름 작성
//export는 {}로 묶어서 import 해준다.
//exort default는 이름 변경 가능

import ccc from "./c.js	" //export default의 경우 {}없이 함수이름만 적는다.
//default를 {}로 묶으면 에러가 난다.

//아래처럼 ccc이름을 변경해서 사용가능하다.
//import zzz from "./c.js"

import {default as kkk} from "./c.js" //ccc함수명 이름을 kkk로 바구는 코드, 
							   			//{}묶어야한다.
//import defaultExport from "./c.js"

//import ddd from "./c.js "
ccc();

var p = new Person("홍길동");
bbb();
kkk();
//defaultExport(); //ccc()호출
console.log(">>>",p.name); 

//a.js에서 b.js에있는
	//employee import, 임플로이를 홍길동 100원 new해서 객체생성
	//이름, sal 출력
	 
import {Employee} from './b.js'

var emp = new Employee("홍길동",100);
console.log(emp.getEmployee()); 
