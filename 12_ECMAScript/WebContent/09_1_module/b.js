export class Person{
	constructor(n)
	{
		this.name=n;
	}
}
export function bbb(){
	console.log("hello");
}
export class Employee{
	constructor(name, sal){
		this.name=name;
		this.sal=sal;
	}
	setName(name){
		this.name=name;
	}
	getName(){
		return this.name;
	}
	setSalary(sal){
		this.sal=sal;
	}
	getSalary(){
		return this.sal;
	}
	getEmployee(){
		return this.name+"\t"+this.sal;
	}
} //end Employee 