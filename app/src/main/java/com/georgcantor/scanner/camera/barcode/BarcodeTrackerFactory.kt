package com.georgcantor.scanner.camera.barcode

import androidx.lifecycle.LifecycleOwner
import com.georgcantor.scanner.camera.GraphicOverlay
import com.google.android.gms.vision.MultiProcessor
import com.google.android.gms.vision.barcode.Barcode

/**
 * Factory for creating a tracker and associated graphic to be associated with a new barcode.  The
 * multi-processor uses this factory to create barcode trackers as needed -- one for each barcode.
 */
internal class BarcodeTrackerFactory(
    private val mGraphicOverlay: GraphicOverlay<BarcodeGraphic?>?,
//    private val viewModel: PickCompleteViewModel?,
    private val lifecycleOwner: LifecycleOwner
) : MultiProcessor.Factory<Barcode> {

    override fun create(barcode: Barcode): BarcodeGraphicTracker {
        val graphic = BarcodeGraphic(mGraphicOverlay, lifecycleOwner)

        return BarcodeGraphicTracker(mGraphicOverlay, graphic)
    }
}