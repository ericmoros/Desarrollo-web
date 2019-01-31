function load() {
    lang.innerHTML = server.session.lang;
    visibility.innerHTML = server.session.visibility;
    timeZone.innerHTML = server.session.timeZone;
}

function main() {
    load();
}

main();