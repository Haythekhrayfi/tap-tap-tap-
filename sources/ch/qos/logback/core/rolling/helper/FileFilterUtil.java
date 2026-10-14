package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class FileFilterUtil {

    public static class a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3724a;

        public a(String str) {
            this.f3724a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.matches(this.f3724a);
        }
    }

    public static String afterLastSlash(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern patternCompile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = patternCompile.matcher(name);
        if (matcher.matches()) {
            return Integer.valueOf(matcher.group(1)).intValue();
        }
        throw new IllegalStateException(q.a("The regex [", str, "] should match [", name, "]"));
    }

    public static File[] filesInFolderMatchingStemRegex(File file, String str) {
        if (file == null) {
            return new File[0];
        }
        return (file.exists() && file.isDirectory()) ? file.listFiles(new a(str)) : new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i10 = Integer.MIN_VALUE;
        for (File file : fileArr) {
            int iExtractCounter = extractCounter(file, str);
            if (i10 < iExtractCounter) {
                i10 = iExtractCounter;
            }
        }
        return i10;
    }

    public static String slashify(String str) {
        return str.replace(CoreConstants.ESCAPE_CHAR, '/');
    }
}
