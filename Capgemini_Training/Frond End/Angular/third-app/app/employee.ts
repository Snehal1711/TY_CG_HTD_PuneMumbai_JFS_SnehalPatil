export class Employee {
    constructor (
        public empId : number ,
        public empName : string,
        public email : string ,
        public phone : number,
        public status : string,
        public pk ?: string
    ) {}
}