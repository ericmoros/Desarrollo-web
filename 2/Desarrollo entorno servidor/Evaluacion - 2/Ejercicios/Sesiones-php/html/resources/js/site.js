function loadIndex() {
    function warnInfo() {
        const infoWarns = [...document.getElementsByClassName('server-info')];
        infoWarns.forEach(iW => {
            (() => {
                setTimeout(() => {
                    iW.style.color = 'red';
                    setTimeout(() => {
                        iW.style.color = 'black';
                        setTimeout(() => {
                            iW.style.color = 'red';
                            setTimeout(() => {
                                iW.style.color = 'black';
                                setTimeout(() => {
                                    iW.style.display = 'none';
                                }, 5000);
                            }, 100);
                        }, 100);
                    }, 100);
                }, 100);
            })();
        });
    }
    lang.innerHTML = server.session.lang;
    visibility.innerHTML = server.session.visibility;
    timeZone.innerHTML = server.session.timeZone;
    warnInfo();
    console.log('loadIndex done');
}

function loadConf() {
    const selects = [
        {
            select: avLang,
            options: server.av.langs,
            optSelected: server.session.lang
        },
        {
            select: avVisibility,
            options: server.av.visibilities,
            optSelected: server.session.visibility
        },
        {
            select: avTimeZone,
            options: server.av.timeZones,
            optSelected: server.session.timeZone
        }
    ];

    function loadOption(loadableOption) {
        const select = loadableOption.select;
        const options = loadableOption.options;
        const optSelected = loadableOption.optSelected;
        if (select != null && options != null && optSelected != null) {
            for (let i = 0; i < options.length; i++) {
                const lang = options[i];
                let option = document.createElement('option');
                option.value = i;
                option.innerHTML = lang;
                select.append(option);
            }
            let selectedOpt = [...select.children].filter(opt => opt.innerText == optSelected);
            selectedOpt[0].selected = true;
        } else {
            console.error(`Error loading: ${loadableOption}`);
        }
    }

    function loadOptions() {
        selects.forEach(select => {
            loadOption(select);
        });
    }

    function saveOption(select) {
        select.parentElement.submit();
    }

    function listenChangeOption() {
        selects.forEach(s => {
            (() => {
                s.select.addEventListener('change', () => {
                    saveOption(s.select);
                });
            })();
        });
    }

    function listenEvents() {
        listenChangeOption();
    }

    loadOptions();
    listenEvents();

    console.log('loadConf done');

}

function load() {
    function getPage() {
        let url = window.location.href;
        let urlReverse = url.split('').reverse().join('');
        let slashPos = urlReverse.indexOf('/');
        let pageReverse = urlReverse.substring(0, slashPos);
        let page = pageReverse.split('').reverse().join('');
        return page;
    }
    let page = getPage();
    switch (page) {
        case '':
        case 'index.php':
            loadIndex();
            break;
        case 'conf.php':
            loadConf();
            break;
        default:
            loadIndex();
            break;
    }
    console.log('load done');
}

function main() {
    load();
}

main();