package ch.qos.logback.core.pattern;

import androidx.activity.j;
import defpackage.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class FormatInfo {
    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo() {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
    }

    public FormatInfo(int i10, int i11) {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i10;
        this.max = i11;
    }

    public FormatInfo(int i10, int i11, boolean z10, boolean z11) {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i10;
        this.max = i11;
        this.leftPad = z10;
        this.leftTruncate = z11;
    }

    public static FormatInfo valueOf(String str) throws IllegalArgumentException {
        Objects.requireNonNull(str, "Argument cannot be null");
        FormatInfo formatInfo = new FormatInfo();
        int iIndexOf = str.indexOf(46);
        String strSubstring = null;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            int i10 = iIndexOf + 1;
            if (i10 == str.length()) {
                throw new IllegalArgumentException(j.a("Formatting string [", str, "] should not end with '.'"));
            }
            strSubstring = str.substring(i10);
            str = strSubstring2;
        }
        if (str != null && str.length() > 0) {
            int i11 = Integer.parseInt(str);
            if (i11 >= 0) {
                formatInfo.min = i11;
            } else {
                formatInfo.min = -i11;
                formatInfo.leftPad = false;
            }
        }
        if (strSubstring != null && strSubstring.length() > 0) {
            int i12 = Integer.parseInt(strSubstring);
            if (i12 >= 0) {
                formatInfo.max = i12;
            } else {
                formatInfo.max = -i12;
                formatInfo.leftTruncate = false;
            }
        }
        return formatInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatInfo)) {
            return false;
        }
        FormatInfo formatInfo = (FormatInfo) obj;
        return this.min == formatInfo.min && this.max == formatInfo.max && this.leftPad == formatInfo.leftPad && this.leftTruncate == formatInfo.leftTruncate;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((((this.min * 31) + this.max) * 31) + (this.leftPad ? 1 : 0)) * 31) + (this.leftTruncate ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.leftPad;
    }

    public boolean isLeftTruncate() {
        return this.leftTruncate;
    }

    public void setLeftPad(boolean z10) {
        this.leftPad = z10;
    }

    public void setLeftTruncate(boolean z10) {
        this.leftTruncate = z10;
    }

    public void setMax(int i10) {
        this.max = i10;
    }

    public void setMin(int i10) {
        this.min = i10;
    }

    public String toString() {
        StringBuilder sbA = a.a("FormatInfo(");
        sbA.append(this.min);
        sbA.append(", ");
        sbA.append(this.max);
        sbA.append(", ");
        sbA.append(this.leftPad);
        sbA.append(", ");
        sbA.append(this.leftTruncate);
        sbA.append(")");
        return sbA.toString();
    }
}
