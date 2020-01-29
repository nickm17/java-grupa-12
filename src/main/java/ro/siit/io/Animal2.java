package ro.siit.io;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ro.siit.oop.Address;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal2 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private Address address;

}
