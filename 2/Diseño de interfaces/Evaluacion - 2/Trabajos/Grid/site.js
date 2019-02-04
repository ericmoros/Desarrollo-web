var site = {
    adds: {
        current: 0,
        images: [
            'img/add-1.png',
            'img/add-2.png',
            'img/add-3.png'
        ]
    }

}

window.onload = afterTime;

function afterTime() {
    setInterval(function () {
        if (site.adds.current < site.adds.images.length - 1) {
            site.adds.current++;
        } else {
            site.adds.current = 0;
        }
        add.src = site.adds.images[site.adds.current];
    }, 10000);
}

window.history.back()