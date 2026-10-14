package ch.qos.logback.core.joran.spi;

import com.developer.filepicker.model.DialogConfigs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class ElementPath {
    public ArrayList<String> partList;

    public ElementPath() {
        this.partList = new ArrayList<>();
    }

    public ElementPath(String str) {
        String[] strArrSplit;
        this.partList = new ArrayList<>();
        if (str == null || (strArrSplit = str.split(DialogConfigs.DIRECTORY_SEPERATOR)) == null) {
            return;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                this.partList.add(str2);
            }
        }
    }

    public ElementPath(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.partList = arrayList;
        arrayList.addAll(list);
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public ElementPath duplicate() {
        ElementPath elementPath = new ElementPath();
        elementPath.partList.addAll(this.partList);
        return elementPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementPath)) {
            return false;
        }
        ElementPath elementPath = (ElementPath) obj;
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

    public String get(int i10) {
        return this.partList.get(i10);
    }

    public List<String> getCopyOfPartList() {
        return new ArrayList(this.partList);
    }

    public String peekLast() {
        if (this.partList.isEmpty()) {
            return null;
        }
        return this.partList.get(this.partList.size() - 1);
    }

    public void pop() {
        if (this.partList.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = this.partList;
        arrayList.remove(arrayList.size() - 1);
    }

    public void push(String str) {
        this.partList.add(str);
    }

    public int size() {
        return this.partList.size();
    }

    public String toStableString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.partList.iterator();
        while (it.hasNext()) {
            e.a(sb2, "[", it.next(), "]");
        }
        return sb2.toString();
    }

    public String toString() {
        return toStableString();
    }
}
