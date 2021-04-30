package ru.dimagor555.factcard.ui.drawfile.canvas.render

import android.graphics.Canvas
import android.graphics.Paint
import ru.dimagor555.factcard.ui.drawfile.canvas.ColorManager
import ru.dimagor555.factcard.ui.drawfile.canvas.FileCanvasView
import javax.inject.Inject

class FileRenderer @Inject constructor(
    private val factCardRenderer: FactCardRenderer,
    private val lineRenderer: LineRenderer,
    private val colorManager: ColorManager,
) {
    private val bgPaint = Paint()

    fun init(canvasView: FileCanvasView) {
        bgPaint.color = colorManager.canvasBgColor
    }

    fun render(canvas: Canvas) {
        clear(canvas)
        renderLines(canvas)
        renderFactCards(canvas)
    }

    private fun clear(canvas: Canvas) {
        canvas.drawPaint(bgPaint)
    }

    private fun renderFactCards(canvas: Canvas) {
        factCardRenderer.render(canvas)
    }

    private fun renderLines(canvas: Canvas) {
        lineRenderer.render(canvas)
    }
}