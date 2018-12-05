const siteName = 'EFiles';
const idLabel = 'f';
const files = [];
const dirPath = phpDir;
var title;
var header;
var ef0;
var efiles;
var upFileForm;
var upFileFormBtn;
var upFileFormInput;
var upFileWarn;
var upFileFormCancel;

// site
function loadSite() {
    getVars();
    setSiteName();
    translateFiles();
    showFiles();
    listenEvents();
    console.log('[loadSite] complete');
}

function getVars() {
    let ef0tmp = e('f0').element;
    ef0 = ef0tmp.cloneNode(true);
    ef0tmp.remove();
    efiles = e('files').element;
    title = e('title');
    header = e('header');
    upFileWarn = e('up-file-warn');
    upFileFormBtn = e('up-file-form-btn');
    upFileFormInput = e('up-file-form-input');
    upFileFormCancel = e('up-file-form-cancel');
}

function setSiteName() {
    console.log('[setSiteName]', siteName);
    title.value = siteName;
    header.value = siteName;
}

function uploadFile() {
    console.log('[uploadFile]');
    upFileFormBtn.element.value = 'Uploading file please wait';
    upFileFormBtn.element.disabled = true;
    upFileFormCancel.element.style.display = 'inline';
}

function uploadFileCancel() {
    console.log('[uploadFileCancel]');
    upFileFormInput.element.disabled = true;
}

function listenEvents() {
    console.log('[listenEvents]');
    upFileFormBtn.element.addEventListener('click', function () {
        console.log('[listenEvents]', 'click', 'upFileFormBtn');
        uploadFile();
    });
    upFileFormCancel.element.addEventListener('click', function () {
        console.log('[listenEvents]', 'click', 'upFileFormCancel');
        uploadFileCancel();
    });
}

// phpTranslate
function translateFiles() {
    console.log(`[translateFiles] [${phpFiles}]`);
    // filter is for remove the extra element that appears when there are no files.
    let translatedFiles = phpFiles.split(fileSeparator).filter(x => x);
    translatedFiles.forEach(file => {
        files.push(file);
    });
}

// files
function showFiles() {
    console.log('[showFiles]');
    files.forEach(file => {
        showFile(file);
    });
    showFileUploaded();
}

function showFile(file) {
    console.log('[showFile]', file);
    let fN = ef0.cloneNode(true);
    let num = document.getElementsByClassName('file').length + 1;
    let id = idLabel + num;
    let fPaths;
    fN.id = id;
    fN.getElementsByClassName('f-name')[0].innerHTML = file;
    fN.getElementsByClassName('f-path')[0].innerHTML = dirPath + file;
    fPaths = fN.getElementsByClassName('f-path-a');
    for (let i = 0; i < fPaths.length; i++) {
        const e = fPaths[i];
        e.href = dirPath + file;
    }
    fN.getElementsByClassName('f-remove')[0].value = file;
    efiles.appendChild(fN);
}

function warnFileUploaded(file_uploaded, warn) {
    console.log('[warnFileUploaded]', file_uploaded);
    if (file_uploaded == 'error')
        upFileWarn.value = `ERROR uploading file`;
    else
        upFileWarn.value = `Upload of ${file_uploaded} complete`;
}

function showFileUploaded() {
    console.log('[showFileUploaded]', file_uploaded);
    if (file_uploaded != '' && files.includes(file_uploaded))
        warnFileUploaded(file_uploaded);
}
