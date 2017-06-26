function SCRIPT_GET_ELEMENT_BORDER(element){
    var div = highlight.div; // only highlight one element per page
       alert('its going good');
    if(element === null) { // remove highlight via `highlight(null)`
        if(div.parentNode) div.parentNode.removeChild(div);
        return;
    }

    var width = element.offsetWidth,
        height = element.offsetHeight;

    div.style.width = width + 'px';
    div.style.height = height + 'px';

    element.offsetParent.appendChild(div);

	    div.style.left = element.offsetLeft + (width - div.offsetWidth) / 2 + 'px';
    div.style.top = element.offsetTop + (height - div.offsetHeight) / 2 + 'px';
}

highlight.div = document.createElement('div');

// set highlight styles
with(highlight.div.style) {
    position = 'absolute';
    border = '5px solid red';
}
function fillField(input) {
    if(input.value=="") {
        input.value = "Name";
    }
}