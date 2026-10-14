package ch.qos.logback.core.rolling.helper;

import androidx.activity.j;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import defpackage.a;
import java.io.File;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class RenameUtil extends ContextAwareBase {
    public static String RENAMING_ERROR_URL = "http://logback.qos.ch/codes.html#renamingError";

    public Boolean areOnDifferentVolumes(File file, File file2) throws RolloverFailure {
        if (!EnvUtil.isJDK7OrHigher()) {
            return Boolean.FALSE;
        }
        File parentFile = file2.getAbsoluteFile().getParentFile();
        if (parentFile == null) {
            addWarn("Parent of target file [" + file2 + "] is null");
            return null;
        }
        if (parentFile.exists()) {
            try {
                return Boolean.valueOf(!FileStoreUtil.areOnSameFileStore(file, parentFile));
            } catch (RolloverFailure e10) {
                addWarn("Error while checking file store equality", e10);
                return null;
            }
        }
        addWarn("Parent of target file [" + file2 + "] does not exist");
        return null;
    }

    public void createMissingTargetDirsIfNecessary(File file) throws RolloverFailure {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        StringBuilder sbA = a.a("Failed to create parent directories for [");
        sbA.append(file.getAbsolutePath());
        sbA.append("]");
        throw new RolloverFailure(sbA.toString());
    }

    public void rename(String str, String str2) throws Throwable {
        if (str.equals(str2)) {
            addWarn("Source and target files are the same [" + str + "]. Skipping.");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new RolloverFailure(j.a("File [", str, "] does not exist."));
        }
        File file2 = new File(str2);
        createMissingTargetDirsIfNecessary(file2);
        addInfo("Renaming file [" + file + "] to [" + file2 + "]");
        if (file.renameTo(file2)) {
            return;
        }
        addWarn("Failed to rename file [" + file + "] as [" + file2 + "].");
        if (Boolean.TRUE.equals(areOnDifferentVolumes(file, file2))) {
            addWarn(q.a("Detected different file systems for source [", str, "] and target [", str2, "]. Attempting rename by copying."));
            renameByCopying(str, str2);
            return;
        }
        addWarn("Please consider leaving the [file] option of RollingFileAppender empty.");
        addWarn("See also " + RENAMING_ERROR_URL);
    }

    public void renameByCopying(String str, String str2) throws Throwable {
        new FileUtil(getContext()).copy(str, str2);
        if (new File(str).delete()) {
            return;
        }
        addWarn("Could not delete " + str);
    }

    public String toString() {
        return "c.q.l.co.rolling.helper.RenameUtil";
    }
}
