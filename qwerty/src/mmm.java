import java.util.Arrays;

import static java.lang.System.*;
public class mmm {

    public static void main(String[] args) {
        test a = new test();
        out.println(123);
    }


    public static class AsciiCharSequence implements CharSequence {
        private byte[] seq;

        public AsciiCharSequence(byte[] seq) {
            this.seq = seq;
        }

        public int length() {
            return this.seq.length;
        }

        public char charAt(int index) {
            return (char) seq[index];
        }

        public AsciiCharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(this.seq, start, end));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte el : seq) {
                sb.append((char) el);
            }
            return sb.toString();
        }

        public String str() {
            return Arrays.toString(this.seq);
        }
    }
}

