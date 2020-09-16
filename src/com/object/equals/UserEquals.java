package com.object.equals;

import java.util.Objects;

public class UserEquals {
    private String name;
    private int years;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEquals that = (UserEquals) o;
        return years == that.years &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years);
    }

    public void classTest(){
        name.getClass();
    }
}
