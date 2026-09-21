```javascript
const [posY, setPosY] = useState(0);

  useEffect(() => {
    const handleScroll = (e) => setPosY(window.pageYOffset);
    window.addEventListener("scroll", handleScroll);
    return () => window.removeEventListener("scroll", handleScroll);
  });

  return <div>{posY}</div>;
```