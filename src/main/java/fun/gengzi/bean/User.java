package fun.gengzi.bean;


import lombok.*;

import java.io.Serializable;

/**
 * @Data  包含
 * @Setter
 * @Getter
 * @ToString
 *
 */
@Data
public class User implements Serializable {
//    @NonNull
    private String username;
//    @NonNull
    private String passwrod;

}
