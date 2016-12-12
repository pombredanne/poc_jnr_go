import jnr.ffi.LibraryLoader;

class JnrMath {
    public interface MathLib {
	long Multiply(long x, long y);
    }

    private static final MathLib MATH_LIB;

    static {
        MATH_LIB = LibraryLoader.create(MathLib.class).load("math");
    }

    public static void main(String[] args) {
        System.out.println(MATH_LIB.Multiply(12345, 67890));
        // output: 838102050
    }
}
