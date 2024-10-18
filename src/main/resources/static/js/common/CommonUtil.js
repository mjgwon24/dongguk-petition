/**
 * 컴포넌트 로드 함수
 * @param filePath 컴포넌트 파일 경로
 * @param elementId 컴포넌트를 로드할 엘리먼트 ID
 */
export const loadComponent = (filePath, elementId) => {
    fetch(filePath)
        .then(response => response.text())
        .then(data => {
            document.getElementById(elementId).innerHTML = data;
        })
        .catch(error => console.error('Error loading component:', error));
};