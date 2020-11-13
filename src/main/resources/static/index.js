const list = document.getElementsById("videoList");

let fetchedVideoList = [];

const loadFetchedVideoList = () => {
loadFetchedVideoList.map(videoList => addToDo(videoList.title));
}

const fetchVideos = async () =>{
const response = await fetch("http://localhost:8080/api/music/")
const data = await response.json();
fetchedVideoList = data
console.log("fetchedVideoList", fetchedVideoList)
loadFetchedVideoList();

}
fetchVideos()