package lk.ijse.backend.util;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//Backend eken error ekak hri true unam hri pennanne true or false witarayi.
//hbi front end ekat eka adura ganna ba. ekata e erro eka cpature karasn eka read karanna use karanawa.
public class APIResponse <T>{

    private int Code;
    private String message;
    private T data;

}