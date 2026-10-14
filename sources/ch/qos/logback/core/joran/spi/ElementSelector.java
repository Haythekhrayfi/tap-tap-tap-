package ch.qos.logback.core.joran.spi;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ElementSelector extends ElementPath {
    public ElementSelector() {
    }

    public ElementSelector(String str) {
        super(str);
    }

    public ElementSelector(List<String> list) {
        super(list);
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    @Override // ch.qos.logback.core.joran.spi.ElementPath
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementSelector)) {
            return false;
        }
        ElementSelector elementSelector = (ElementSelector) obj;
        if (elementSelector.size() != size()) {
            return false;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!equalityCheck(get(i10), elementSelector.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public boolean fullPathMatch(ElementPath elementPath) {
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!equalityCheck(get(i10), elementPath.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int getPrefixMatchLength(ElementPath elementPath) {
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size == 0 || size2 == 0) {
            return 0;
        }
        if (size > size2) {
            size = size2;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size && equalityCheck(this.partList.get(i11), elementPath.partList.get(i11)); i11++) {
            i10++;
        }
        return i10;
    }

    public int getTailMatchLength(ElementPath elementPath) {
        int i10 = 0;
        if (elementPath == null) {
            return 0;
        }
        int size = this.partList.size();
        int size2 = elementPath.partList.size();
        if (size != 0 && size2 != 0) {
            int i11 = size <= size2 ? size : size2;
            for (int i12 = 1; i12 <= i11 && equalityCheck(this.partList.get(size - i12), elementPath.partList.get(size2 - i12)); i12++) {
                i10++;
            }
        }
        return i10;
    }

    public int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode ^= get(i10).toLowerCase(Locale.US).hashCode();
        }
        return iHashCode;
    }

    public boolean isContainedIn(ElementPath elementPath) {
        if (elementPath == null) {
            return false;
        }
        return elementPath.toStableString().contains(toStableString());
    }
}
