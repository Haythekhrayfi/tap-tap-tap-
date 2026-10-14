package w2;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37087a;

    public h(String str) {
        this.f37087a = str;
    }

    public abstract List<File> a(FileProvider fileProvider);

    public List<File> b(FileProvider fileProvider, String str) {
        File[] fileArrListFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        return Arrays.asList(fileArrListFiles);
    }

    public abstract boolean c(File file);
}
