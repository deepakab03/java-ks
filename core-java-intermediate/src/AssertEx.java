public class AssertEx {

    AssertEx(Integer i) {
        if (i == null) {
            throw new NullPointerException("passed int can't be null");
        }
        init(i);
    }

    private void init(Integer i) {
        assert(i < 100): "i is greater than 100!!";
           //i  should be < 100
        //... other logic if () {} else {}

        //assert(i > 10);
    }

}