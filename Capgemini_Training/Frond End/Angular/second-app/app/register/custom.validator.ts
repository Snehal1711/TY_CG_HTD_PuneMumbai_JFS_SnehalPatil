import { AbstractControl, ValidationErrors } from '@angular/forms';

export class CustomValidator{
    static noSpace(control : AbstractControl):ValidationErrors { 
        if((control.value as string).indexOf(' ') >=0){
            return { noSpace : true};
        }else{
            return null;
        }
    }
}