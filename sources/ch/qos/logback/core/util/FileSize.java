package ch.qos.logback.core.util;

import android.support.v4.media.session.e;
import androidx.activity.j;
import i.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class FileSize {
    private static final int DOUBLE_GROUP = 1;
    private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    private static final String LENGTH_PART = "([0-9]+)";
    public static final long MB_COEFFICIENT = 1048576;
    private static final int UNIT_GROUP = 2;
    private static final String UNIT_PART = "(|kb|mb|gb)s?";
    public final long size;

    public FileSize(long j10) {
        this.size = j10;
    }

    public static FileSize valueOf(String str) {
        long j10;
        Matcher matcher = FILE_SIZE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(j.a("String value [", str, "] is not in the expected format."));
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        long jLongValue = Long.valueOf(strGroup).longValue();
        if (strGroup2.equalsIgnoreCase("")) {
            j10 = 1;
        } else if (strGroup2.equalsIgnoreCase("kb")) {
            j10 = 1024;
        } else if (strGroup2.equalsIgnoreCase("mb")) {
            j10 = MB_COEFFICIENT;
        } else {
            if (!strGroup2.equalsIgnoreCase("gb")) {
                throw new IllegalStateException(f.a("Unexpected ", strGroup2));
            }
            j10 = GB_COEFFICIENT;
        }
        return new FileSize(jLongValue * j10);
    }

    public long getSize() {
        return this.size;
    }

    public String toString() {
        long j10 = this.size;
        long j11 = j10 / 1024;
        if (j11 == 0) {
            return e.a(new StringBuilder(), this.size, " Bytes");
        }
        long j12 = j10 / MB_COEFFICIENT;
        if (j12 == 0) {
            return j11 + " KB";
        }
        long j13 = j10 / GB_COEFFICIENT;
        if (j13 == 0) {
            return j12 + " MB";
        }
        return j13 + " GB";
    }
}
