package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeAppearancePathProvider {
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    public static class Lazy {
        public static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i10);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i10);
    }

    public static final class ShapeAppearancePathSpec {
        public final RectF bounds;
        public final float interpolation;
        public final Path path;
        public final PathListener pathListener;
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f10;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.cornerPaths[i10] = new ShapePath();
            this.cornerTransforms[i10] = new Matrix();
            this.edgeTransforms[i10] = new Matrix();
        }
    }

    private float angleOfEdge(int i10) {
        return (i10 + 1) * 90;
    }

    private void appendCornerPath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10) {
        this.scratch[0] = this.cornerPaths[i10].getStartX();
        this.scratch[1] = this.cornerPaths[i10].getStartY();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        Path path = shapeAppearancePathSpec.path;
        float[] fArr = this.scratch;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.cornerPaths[i10].applyToPath(this.cornerTransforms[i10], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i10], this.cornerTransforms[i10], i10);
        }
    }

    private void appendEdgePath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10) {
        ShapePath shapePath;
        Matrix matrix;
        Path path;
        int i11 = (i10 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i10].getEndX();
        this.scratch[1] = this.cornerPaths[i10].getEndY();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i11].getStartX();
        this.scratch2[1] = this.cornerPaths[i11].getStartY();
        this.cornerTransforms[i11].mapPoints(this.scratch2);
        float[] fArr = this.scratch;
        float f10 = fArr[0];
        float[] fArr2 = this.scratch2;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i10);
        this.shapePath.reset(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i10, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(fMax, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i10], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i10) || pathOverlapsCorner(this.edgePath, i11))) {
            Path path2 = this.edgePath;
            path2.op(path2, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i10].mapPoints(this.scratch);
            Path path3 = this.overlappedEdgePath;
            float[] fArr3 = this.scratch;
            path3.moveTo(fArr3[0], fArr3[1]);
            shapePath = this.shapePath;
            matrix = this.edgeTransforms[i10];
            path = this.overlappedEdgePath;
        } else {
            shapePath = this.shapePath;
            matrix = this.edgeTransforms[i10];
            path = shapeAppearancePathSpec.path;
        }
        shapePath.applyToPath(matrix, path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i10], i10);
        }
    }

    private void getCoordinatesOfCorner(int i10, RectF rectF, PointF pointF) {
        float f10;
        float f11;
        if (i10 != 1) {
            if (i10 != 2) {
                f10 = i10 != 3 ? rectF.right : rectF.left;
                f11 = rectF.top;
            } else {
                f10 = rectF.left;
            }
            pointF.set(f10, f11);
        }
        f10 = rectF.right;
        f11 = rectF.bottom;
        pointF.set(f10, f11);
    }

    private CornerSize getCornerSizeForIndex(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        if (i10 == 1) {
            return shapeAppearanceModel.getBottomRightCornerSize();
        }
        if (i10 != 2) {
            return i10 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomLeftCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        if (i10 == 1) {
            return shapeAppearanceModel.getBottomRightCorner();
        }
        if (i10 != 2) {
            return i10 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner();
        }
        return shapeAppearanceModel.getBottomLeftCorner();
    }

    private float getEdgeCenterForIndex(RectF rectF, int i10) {
        float fCenterX;
        float f10;
        float[] fArr = this.scratch;
        ShapePath[] shapePathArr = this.cornerPaths;
        fArr[0] = shapePathArr[i10].endX;
        fArr[1] = shapePathArr[i10].endY;
        this.cornerTransforms[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            fCenterX = rectF.centerX();
            f10 = this.scratch[0];
        } else {
            fCenterX = rectF.centerY();
            f10 = this.scratch[1];
        }
        return Math.abs(fCenterX - f10);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        if (i10 == 1) {
            return shapeAppearanceModel.getBottomEdge();
        }
        if (i10 != 2) {
            return i10 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge();
        }
        return shapeAppearanceModel.getLeftEdge();
    }

    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i10) {
        this.cornerPath.reset();
        this.cornerPaths[i10].applyToPath(this.cornerTransforms[i10], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void setCornerPathAndTransform(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10) {
        getCornerTreatmentForIndex(i10, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i10], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i10, shapeAppearancePathSpec.shapeAppearanceModel));
        float fAngleOfEdge = angleOfEdge(i10);
        this.cornerTransforms[i10].reset();
        getCoordinatesOfCorner(i10, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i10];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i10].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i10) {
        this.scratch[0] = this.cornerPaths[i10].getEndX();
        this.scratch[1] = this.cornerPaths[i10].getEndY();
        this.cornerTransforms[i10].mapPoints(this.scratch);
        float fAngleOfEdge = angleOfEdge(i10);
        this.edgeTransforms[i10].reset();
        Matrix matrix = this.edgeTransforms[i10];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i10].preRotate(fAngleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, Path path) {
        calculatePath(shapeAppearanceModel, f10, rectF, null, path);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, PathListener pathListener, Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f10, rectF, pathListener, path);
        for (int i10 = 0; i10 < 4; i10++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i10);
            setEdgePathAndTransform(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            appendCornerPath(shapeAppearancePathSpec, i11);
            appendEdgePath(shapeAppearancePathSpec, i11);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }

    public void setEdgeIntersectionCheckEnable(boolean z10) {
        this.edgeIntersectionCheckEnabled = z10;
    }
}
