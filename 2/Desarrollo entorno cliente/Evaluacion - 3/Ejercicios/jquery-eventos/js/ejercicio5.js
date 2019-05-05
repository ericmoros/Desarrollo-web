class TooltipData {
    constructor(pen, pj, min, golesMin) {
        this.pen = pen
        this.pj = pj
        this.min = min
        this.golesMin = Math.round(min / golesMin)
    }

    toString() {
        return `
            Pen: ${this.pen}\n
            PJ: ${this.pj}\n
            min: ${this.min}\n
            Goles/min: ${this.golesMin}
        `
    }
}
$(window).ready(function () {
    var data = $('tbody tr')
    Array.from(data).forEach(tr => {
        var children = $(tr).children()
        var tooltipData = new TooltipData(
            $(children.get(4)).html(),
            $(children.get(5)).html(),
            $(children.get(6)).html(),
            $(children.get(7)).html()
        )
        $(tr).attr('class', 'tooltippy tooltippy--top')
        $(tr).attr('data-tooltippy', tooltipData.toString())
    })
})