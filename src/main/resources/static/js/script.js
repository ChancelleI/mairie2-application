/*$(document).ready(function () {
    $(".sidebar-btn").click(function () {
        $(".wrapper").toggleClass("collapse");
    });
});*/




// On va chercher les différents éléments de notre page
const pages = document.querySelectorAll(".page")
const header = document.querySelector("#pageNumber")
const nbPages = pages.length // Nombre de pages du formulaire
let pageActive = 1

// On attend le chargement de la page
window.onload = () => {
	console.log("bon");
    if (document.querySelector(".page"))
        document.querySelector(".page").style.display = "flex"
    // On affiche les numéros des pages dans l'entête
    // On parcourt la liste des pages
    pages.forEach((page, index) => {
        // On crée l'élément "numéro de page"
        let element = document.createElement("div")
        element.classList.add("page-num")
        element.id = "num" + (index + 1)
        if (pageActive === index + 1) {
            element.classList.add("active")
        }
        element.innerHTML = index + 1
        header.appendChild(element)
    })

    // On gère les boutons "suivant"
    let boutons = document.querySelectorAll(".next")

    for (let bouton of boutons) {
        bouton.addEventListener("click", pageSuivante)
    }

    // On gère les boutons "precedent"
    boutons = document.querySelectorAll(".prev")

    for (let bouton of boutons) {
        bouton.addEventListener("click", pagePrecedente)
    }

    let add = document.querySelector('.js_addbtn');
    let modal = document.querySelector('.modal');
    let closeform = document.querySelector('.close-modal > span');
    let fin = document.querySelector('.fin');
	console.log(add);
    if (add)
        add.onclick = function () {
            return showModal();
        }

    if (closeform)
        closeform.onclick = function () {
            return hideModal();
        }

    if (fin)
        fin.onclick = function () {
            return location.reload();
        }

    function showModal() {
		console.log("bonjour");
        modal.style.display = 'flex';
    }

    function hideModal() {
        modal.style.display = 'none'
    }

}

/**
 * Cette fonction fait avancer le formulaire d'une page
 */
function pageSuivante() {
    // On masque toutes les pages
    for (let page of pages) {
        page.style.display = "none"
    }

    // On affiche la page suivante
    this.parentElement.parentElement.nextElementSibling.style.display = "flex"

    // On "désactive" la page active
    document.querySelector(".active").classList.remove("active")

    // On incrémente pageActive
    pageActive++

    // On "active" le nouveau numéro
    document.querySelector("#num" + pageActive).classList.add("active")
}

/**
 * Cette fonction fait reculer le formulaire d'une page
 */
function pagePrecedente() {
    // On masque toutes les pages
    for (let page of pages) {
        page.style.display = "none"
    }

    // On affiche la page suivante
    this.parentElement.parentElement.previousElementSibling.style.display = "flex"

    // On "désactive" la page active
    document.querySelector(".active").classList.remove("active")

    // On incrémente pageActive
    pageActive--

    // On "active" le nouveau numéro
    document.querySelector("#num" + pageActive).classList.add("active")
}
